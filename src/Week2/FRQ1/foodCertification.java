package Week2.FRQ1;

public class foodCertification {
    /*
    100 times or equal = A
    100>x>=50 times = B
    50>x = c
     */
    public String foodCertification(String foodType, String foodDesc)
    {
        int typeCount = 0;
        int descCount = 0;
        for (int i = 0; i < meals.size() - 1; i++) {
            for (int j = 0; j < meals.get(i).getFoods().length - 1; j++) {
                if(meals.get(j).getFoods().getFoodDesc().equals(foodDesc))
                    descCount++;
            }
        }

        for (int i = 0; i < meals.size() - 1; i++) {
            for (int j = 0; j < meals.get(i).getFoods().length - 1; j++) {
                if(meals.get(j).getFoods().getFoodType().equals(foodType))
                    typeCount++;
            }
        }

        int totalCount = typeCount + descCount;
        if(totalCount >= 100)
            return "A";
        else if(totalCount >= 50)
            return "B";
        else
            return "C";

    }

    public boolean mealMasterChef(Meal mealCombo)
    {
        for (int i = 0; i < meals.size() - 1; i++) {
            if(meals.get(i) == mealCombo)
            {
                for (int j = 0; j < meals.get(i).getFoods().length - 1; j++) {
                    if(!(foodCertification(meals.get(j).getFoods().getFoodType(), meals.get(j).getFoods().getFoodDesc()).equals("A")))
                        return false;
                }
            }
        }
        return true;
    }

}
