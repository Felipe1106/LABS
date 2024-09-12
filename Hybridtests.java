import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import c.TestMe;

public class Hybridtests {

	Hybrid hybrid;

	@Before
	public void setUp() throws Exception {
		hybrid  = new Hybrid();
    }

	@Test
	public void mpgTest() {

		double miles = 41;
        double gallons = 1.2;
        double expectedMPG = miles/gallons;

        hybrid.setMilesfromGas(miles);
        hybrid.setGallonsfromGas(gallons);

		double actualMPG = hybrid.calcGasMPG();

		assertTrue(actualMPG == expectedMPG);
	}

	@Test
	public void mpgETest() {

		double miles = 100;
        double kwh = 33.7;
        double expectedMPGe = (miles/kwh) * 33.7;

        hybrid.setElectricMiles(miles);
        hybrid.setTotalkWh(kwh);

		double actualMPGe = hybrid.calcMPGe();

		assertTrue(actualMPGe == expectedMPGe);
	}


	@Test
	public void AverageMPG() {
		double gasMiles = 100;
		double gallons = 2;
		double expectedGasMPG = gasMiles / gallons;
	
		double electricMiles = 100;
		double kWh = 33.7;
		double expectedMPGe = (electricMiles / kWh) * 33.7;
	
		double expectedAverageMPG = (expectedGasMPG + expectedMPGe) / 2;
	
		hybrid.setMilesfromGas(gasMiles);
		hybrid.setGallonsfromGas(gallons);
		hybrid.setElectricMiles(electricMiles);
		hybrid.setTotalkWh(kWh);
	
		double actualAverageMPG = hybrid.calcAverageMPGHybridMode();
	
		assertTrue(actualAverageMPG == expectedAverageMPG);

	}

}