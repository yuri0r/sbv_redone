/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbv;
//Taken from http://stackoverflow.com/questions/18404553/proper-way-of-printing-a-bufferedimage-in-java
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class PrintActionListener implements Runnable {

    private BufferedImage       image;

    public PrintActionListener(java.awt.image.BufferedImage image) {
        this.image = image;
    }

    @Override
    public void run() {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        
        printJob.setPrintable(new ImagePrintable(printJob, image));

        if (printJob.printDialog()) {
            try {
                printJob.print();
            } catch (PrinterException prt) {
                prt.printStackTrace();
            }
        }
    }

    public class ImagePrintable implements Printable {

        private double          x, y, width;

        private int             orientation;

        private BufferedImage   image;

        public ImagePrintable(PrinterJob printJob, BufferedImage image) {
            PageFormat pageFormat = printJob.defaultPage();
            this.x = pageFormat.getImageableX();
            this.y = pageFormat.getImageableY();
            this.width = pageFormat.getImageableWidth();
            this.orientation = pageFormat.getOrientation();
            printJob.validatePage(pageFormat);
            this.image = image;
        }

        @Override
        public int print(Graphics g, PageFormat pageFormat, int pageIndex)
                throws PrinterException {
            if (pageIndex == 0) {
                int pWidth = 0;
                int pHeight = 0;
                if (orientation == PageFormat.PORTRAIT) {
                    pWidth = (int) Math.min(width, (double) image.getWidth());
                    pHeight = pWidth * image.getHeight() / image.getWidth();
                } else {
                    pHeight = (int) Math.min(width, (double) image.getHeight());
                    pWidth = pHeight * image.getWidth() / image.getHeight();
                }
                g.drawImage(image, (int) x, (int) y, pWidth, pHeight, null);
                return PAGE_EXISTS;
            } else {
                return NO_SUCH_PAGE;
            }
        }

    }

}