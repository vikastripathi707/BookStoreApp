package com.mycompany.bookstore.serdeser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mycompany.bookstore.entity.BookEntity;

public class BookSerializer {

    public static void serializeBook(BookEntity bookEntity) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            fos = new FileOutputStream(bookEntity.getBookId()+".ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookEntity);

        }catch(IOException ex) {
            ex.printStackTrace();
        }

        finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static BookEntity deSerializeBook(Long bookId) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        BookEntity be = null;

        try {

            fis = new FileInputStream(bookId+".ser");
            ois = new ObjectInputStream(fis);
            be = (BookEntity) ois.readObject();

        }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException ex) {
            ex.printStackTrace();
        }

        finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return be;
    }
}