public class JavaStringWordCount {
    public static void main(String[] args){
        String strValue = "Hi, New Year Celebrations";
        String string = strValue.toLowerCase();
        String[] words = string.split("\\W");
        int count=0;
        for (int i=0;i< words.length;i++){
            if (!words[i].equals(' ')){
                count++;
            }
        }
        System.out.print("Number of words present in the given string are : "+count);
    }
}
