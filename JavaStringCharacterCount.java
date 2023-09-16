public class JavaStringCharacterCount {
    public static void main(String[] args){
        String strValue = "New Year Celebration";
        int count=0;
        for(int i =0; i<strValue.length();i++){
            if(strValue.charAt(i)!=' '){
                count++;
            }
        }
        System.out.print("Number of characters present in a string are : "+count);
    }
}
