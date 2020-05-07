//package Week2.FRQ3;
//
//public class FuelDepot {
//    public int nextTanktoFill(int threshold)
//    {
//        int posFill = tanks.getCurrentIndex();
//        int lowestfuel = -1;
//        //if robot is moving right
//        if(tanks.isFacingRight())
//        {
//            for (int i = tanks.getCurrentIndex(); i < tanks.size() - 1; i++) {
//                if((tanks(i).getFuelLevel() <= threshold) && (tanks(i).getFuelLevel < lowestfuel))
//                    posFill == i;
//            }
//        }
//
//
//        //if robot is moving left
//        else
//        {
//            for (int i = tanks.getCurrentIndex(); i == 0; i--) {
//                if((tanks(i).getFuelLevel() <= threshold) && (tanks(i).getFuelLevel < lowestfuel))
//                    posFill == i;
//            }
//        }
//        return posFill;
//    }
//
//    public void moveToLocation(int locIndex)
//    {
//        //checking to see if we need to change direction
//        if(tanks.getCurrentIndex() > locIndex)
//            tanks.changeDirection();
//        int amountChange = Math.abs(tanks.getCurrentIndex() - locIndex);
//        tanks.moveForward(amountChange);
//    }
//}
