
package serializacion1;

import java.io.*;


/**
 *
 * @author jquesadaabeijon
 */
public class Serializacion1{

    public static File fis = new File("/home/local/DANIELCASTELAO/jquesadaabeijon/NetBeansProjects/serializacion1/serial.txt");
    public static ObjectOutputStream rec;
    public static ObjectInputStream rd;
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        rec = new ObjectOutputStream(new FileOutputStream(fis));
        rd = new ObjectInputStream(new FileInputStream(fis));
        
        Mclase m = new Mclase("Adiós", -7, 2.7E10);
        rec.writeObject(m);
        rec.close();
        Mclase z = (Mclase) rd.readObject();
        rd.close();
        System.out.println(z.toString());
        
    }
//    
//    public static Mclase leertxt(ObjectInputStream r) throws IOException, ClassNotFoundException{
//        Mclase re = new Mclase();
//        re = (Mclase) rd.readObject();
//        return re;
//    }
//    
//    public static void guardaryescribirtxt(Mclase h, ObjectOutputStream r) throws IOException{
//        r.writeObject(h);
//        r.close();
//    }
}
