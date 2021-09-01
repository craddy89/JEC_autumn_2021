package mvc;

public class View {


    // Utilities methods
    public void printMessage (String message){
        System.out.print(message);
    }

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString.append(v);
        }
        return new String(concatString);
    }
}
