package Week4.FRQ3;

public class Trail {
    private int[] markers;
    public boolean isLevelTrailSegment(int start, int end)
    {
        int min = 0;
        int max = 0;
        for (int i = start; i < end; i++) {
            if(markers[i] > max)
            {
                max = markers[i];
            }
            if(markers[i] < min)
            {
                min = markers[i];
            }
        }
        return (max - min) <= 10;
    }

    public boolean isDifficult()
    {
        int elvChange = 0;
        for (int i = 0; i <= markers.length - 1; i++) {
            if(Math.abs(markers[i] - markers[i + 1]) > 30)
            {
                ++elvChange;
            }
        }
        return elvChange >= 3;
    }
}
