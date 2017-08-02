
public class main {

	public static void main(String[] args) {
		int size = 500;
		double[] series = new double[size];
		SaveAndReadFiles file = new SaveAndReadFiles();
		GenerateRandomDataSet randomDataSet = new GenerateRandomDataSet(10);
		series = randomDataSet.generateRandomSetSmallVariation(10);
		
		file.saveFile(series);
		file.readFile(series);

	}
	


}
