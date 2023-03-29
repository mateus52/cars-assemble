public class CarsAssemble {
    
    private double carPorMinuto = 3.68;
    private double carPorhora = 221;
    
	public double productionRatePerHour(int speed) {
		return calculo(speed, carPorhora);
	}

	public int workingItemsPerMinute(int speed) {
        return (int) calculo(speed, carPorMinuto);
	}

    private double calculo(int speed, double tempo){
        double result = 0;
		if (speed > 0 && speed <= 4) {
			result = speed * tempo;
		} else if (speed > 4 && speed <= 8) {
			double sucesso = 90.0 / 100.0;
			result = (speed * tempo) * sucesso;
		} else if (speed == 9) {
			double sucesso = 80.0 / 100.0;
			result = (speed * tempo) * sucesso;
		} else {
			double sucesso = 77.0 / 100.0;
			result = (speed * tempo) * sucesso;
		}
		return result;
    }
}
