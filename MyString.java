public class MyString 
{ 
    public static boolean CheckError(String str) // return true if theres only small letters in the word anf false if not
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<123&&str.charAt(i)>96)
            return true;
            if(str.charAt(i)>64&&str.charAt(i)<91)
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) 
    {
        String strnew="";
        char chr=' ';
   
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>64&&str.charAt(i)<91)
            {
            chr =(char)str.charAt(i);
            chr=(char) (chr+32);
            strnew=strnew+(chr);
            }
            else
            {
                chr=str.charAt(i);
                strnew=strnew+chr;
            }
        }
        return strnew;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) 
    {
        return str1.contains(str2);
    }
}
