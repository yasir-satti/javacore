package com.example.javacoredemo.iostreams;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The InputStream class of the java.io package is an abstract superclass that represents an input stream of bytes.
 *
 * Since InputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.
 * Some of them are:
 *
 *
 * <ul>
 *     <li>
 *         FileInputStream
 *     </li>
 *     <li>
 *         ByteArrayInputStream
 *     </li>
 *     <li>
 *         ObjectInputStream
 *     </li>
 * </ul>
 *
 * <br>
 * <br> Methods of InputStream (9)
 *
 * <br>The InputStream class provides different methods that are implemented by its subclasses. Here are some of the
 * commonly used methods:
 * <br>
 *
 * <ul>
 *     <li>
 *         read() - reads one byte of data from the input stream
 *     </li>
 *     <li>
 *         read(byte[] array) - reads bytes from the stream and stores in the specified arra
 *     </li>
 *     <li>
 *         read(byte[] b, int off, int len) - Reads up to len bytes of data from the input stream into an array of bytes.
 *     </li>
 *     <li>
 *         available() - returns the number of bytes available in the input stream
 *     </li>
 *     <li>
 *         mark() - marks the position in the input stream up to which data has been read
 *     </li>
 *     <li>
 *         reset() - returns the control to the point in the stream where the mark was set
 *     </li>
 *     <li>
 *         markSupported() - checks if the mark() and reset() method is supported in the stream
 *     </li>
 *     <li>
 *         skips() - skips and discards the specified number of bytes from the input stream
 *     </li>
 *     <li>
 *         close() - closes the input stream
 *     </li>
 * </ul>
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/inputstream" target="_blank"> Java InputStream</a>
 * <br>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=_LF7txOx9wg" target="_blank"> Java InputStream ( video )</a>
 * <br>
 * <br>*
 * <br>
 * <br><img src="JavaInputStream.png" alt="Java InputStream" width="600" height="400">
 */


public class IOinputStream {


    /**
     * Demonstrates methods of IOinputStream class.
     *
     * @since 1.0
     */

    public void demo(){

        byte[] array = new byte[100];

        try {

            InputStream input = new FileInputStream("data/ioinputstreamInput.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();
        } catch (Exception e) {

            System.out.println(e.getStackTrace());
        }
    }
}
