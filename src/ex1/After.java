package ex1;

public class After {

    public int[] getMinMax(int[] numbers) {
        if (numbers.length < 1) return null;
        int[] minAndMax = new int[]{numbers[0], numbers[0]};

        for (int i : numbers) {
            if (minAndMax[0] > i) minAndMax[0] = i;
            if (minAndMax[1] < i) minAndMax[1] = i;
        }

        return minAndMax;
    }
}
