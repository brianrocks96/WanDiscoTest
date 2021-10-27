import org.junit.Assert;
import org.junit.Test;

public class VolumeCalculatorTest {

    private static final int doubleDelta = 0;
    VolumeCalculator  volumeCalculator= new VolumeCalculator();

    @Test
    public void testVolumeOfSphereRadius1() {
        double testRadius = 1;
        double expectedVolume = 4.19;

        Assert.assertEquals(expectedVolume, volumeCalculator.volumeOfSphere(testRadius), doubleDelta);
    }

    @Test
    public void testVolumeOfSphereRadius5() {
        double testRadius = 5;
        double expectedVolume = 523.6;

        Assert.assertEquals(expectedVolume, volumeCalculator.volumeOfSphere(testRadius), doubleDelta);
    }

    @Test
    public void testVolumeOfCubeWidth1() {
        double testWidth = 1;
        double expectedVolume = 1;

        Assert.assertEquals(expectedVolume, volumeCalculator.volumeOfCube(testWidth), doubleDelta);
    }

    @Test
    public void testVolumeOfCubeWidth5() {
        double testWidth = 5;
        double expectedVolume = 125;

        Assert.assertEquals(expectedVolume, volumeCalculator.volumeOfCube(testWidth), doubleDelta);
    }

    @Test
    public void testVolumeOfTetrahedronEdge1() {
        double testEdge = 1;
        double expectedVolume = 0.12;

        Assert.assertEquals(expectedVolume, volumeCalculator.volumeOfTetrahedron(testEdge), doubleDelta);
    }

    @Test
    public void testVolumeOfTetrahedronEdge5() {
        double testEdge = 5;
        double expectedVolume = 14.73;

        Assert.assertEquals(expectedVolume, volumeCalculator.volumeOfTetrahedron(testEdge), doubleDelta);
    }
}
