public class a{
    public static void main(String[] args) {
        
        // String str = "Hello";
        // String str1 = "Hello";
        // System.out.println(str==str1);

        // String s = new String("Hello");
        // // String s2 = new String("Hello1");
        // String s2 = new String("Hello1");
        // // System.out.println(s==s2);
        // System.out.println(s.equals(s2));
        

        String strN = "ABCDEFGH";
        // System.out.println(strN.toLowerCase()); 
        // System.out.println(strN.toCharArray()); 
        // System.out.println(strN.toUpperCase()); 
        // System.out.println(strN.substring(3)); 
        // System.out.println(strN.substring(3,2)); 
        // System.out.println(strN.length());
        
        

        // String city="Delhi,Pune,BLR,HTD,Patns,Bhubaneswar";
        // String city="Delhi Pune BLR HTD Patns Bhubaneswar";
        // String city="DelhieBLRHTDPatnsBhubaneswar";
        // String city="Delhi@Pune#BLR$HTD^Patns#Bhubaneswar";
        String city="Delhi@!Pune@#BLR$$#HTD%^Patns*&#Bhubaneswar";
        // String cityArr[] =  city.split(",");
        // String cityArr[] =  city.split(" ");
        String cityArr[] =  city.split("\\W+");
        // String cityArr[] =  city.split("\\W");
        // String cityArr[] =  city.split("\\W");
        // String cityArr[] =  city.split(" ");
        for(String s:cityArr){
                System.out.println(s);
        }
    }
}