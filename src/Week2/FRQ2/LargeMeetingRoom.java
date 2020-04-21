package Week2.FRQ2;

public class LargeMeetingRoom {
    public boolean electricityOk()
    {
        if(sqFootage() >= 10000)
            return false;
        for (int i = 0; i < rooms.size() -1 ; i++) {
            if(!(rooms(i).electrityOk))
                return false;
        }
        return true;
    }
}
