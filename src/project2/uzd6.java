package project2;
public class uzd6 {
    public static void main(String[] args) {
        
        byte[] data = {
            72, 101, 108, 108, 111, 33, 32, 77, 121, 32,
            115, 107, 105, 108, 108, 115, 32, 97, 114, 101,
            32, 103, 114, 101, 97, 116, 32, 97, 108, 114,
            101, 97, 100, 121, 33
        };

        String text = getTextFromBytes(data);
        System.out.println(text);
    }

    static String getTextFromBytes(byte[] array){
        String result = "";

        for (int i = 0; i < array.length; i++)
            result += (char) array[i]; //byte to char

        return result;
    }
}
