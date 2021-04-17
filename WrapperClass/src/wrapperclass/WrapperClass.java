package wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        // data types to  objects (retrieving data types from objects)
        // wrapping objects to primitive data types
        
        byte a = 1;  // byte data type       
        Byte byteObject = Byte.valueOf(a);  // wrapping around Byte object
        
        short b = 22;
        Short shortObject = Short.valueOf(b);
        
        int c = 100;
        Integer integerObject = Integer.valueOf(c);
        
        long d = 199;
        Long longObject = Long.valueOf(d);
        
        float e = 3.3f;
        Float floatObject = Float.valueOf(e);
        
        double f = 555;
        Double doubleObject = Double.valueOf(f);
        
        boolean g = true;
        Boolean booleanObject = Boolean.valueOf(g);
        
        char h = 'Z';
        Character characterObject = Character.valueOf(h);

        
        //  printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        
        System.out.println("Byte object byteobj:  " + byteObject);
        System.out.println("Short Object shortobj:  " + shortObject);
        System.out.println("Integer object intobj:  " + integerObject);
        System.out.println("Long object longobj:  " + longObject);
        System.out.println("Float object floatobj:  " + floatObject);
        System.out.println("Double object doubleobj:  " + doubleObject);
        System.out.println("Character object charobj:  " + characterObject);
        
        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        
        byte bu = byteObject;
        short su = shortObject;
        int iu = integerObject;
        long lu = longObject;
        float fu = floatObject;
        double du = doubleObject;
        char cu = characterObject;
        
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        
        // printing the values from primitive data types
        
        System.out.println("Unwrapped values (printing as primitive data types)");
        
        System.out.println("byte value, bu: " + bu);
        System.out.println("short value, su: " + su);
        System.out.println("int value, iu: " + iu);
        System.out.println("long value, lu: " + lu);
        System.out.println("float value, fu: " + fu);
        System.out.println("double value, du: " + du);
        System.out.println("char value, cu: " + cu);
    }
}