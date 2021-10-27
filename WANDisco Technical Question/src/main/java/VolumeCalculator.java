import java.text.DecimalFormat;

public class VolumeCalculator {

    private static final DecimalFormat df = new DecimalFormat("#.##");

    public double volumeOfSphere (double radius) {
        double volume = (4.0/3.0) * Math.PI * (Math.pow(radius, 3));

        return Double.parseDouble(df.format(volume));
    }

    public double volumeOfCube(double width) {
        double volume = Math.pow(width, 3);

        return Double.parseDouble(df.format(volume));
    }

    public double volumeOfTetrahedron (double edge) {
        double volume = Math.pow(edge, 3) / (6 * Math.sqrt(2));

        return Double.parseDouble(df.format(volume));
    }

}
