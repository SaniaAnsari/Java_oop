package Dice_Roller;

import java.util.Random;

    public class dice {
        Random random;

        public dice() {
            random = new Random();
        }
        int Roll(){
            return random.nextInt(6)+1;
        }
    }


