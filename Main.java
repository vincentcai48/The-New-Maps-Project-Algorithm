import java.io.File;

public class Main {

    //Program Arguments: state name, input file name, # of districts, threshold (as a decimal percent)
    public static void main(String[] args){
        String stateName = args[0]; //Name of the State
        String filePath = "inputfiles/"+args[1]; //Name of the file
        int districts = Integer.parseInt(args[2]); //# of districts
        double threshold = Double.parseDouble(args[3]);//threshold
        Calculate c = new Calculate(filePath,districts,threshold,stateName);
    }
}
