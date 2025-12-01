package Clonning;

    public class Array implements Cloneable{
        private int[] anArray;
        private int value;

        public Array(){
            anArray= new int[]{1, 2, 3, 4, 5, 6};
            value=10;
        }
        public void increment(){
            for(int i=0;i< anArray.length;i++){
                anArray[i]++;
            }
        }
        public String toString(){
            String result="[";
            for(int i=0;i< anArray.length;i++){
                result+=anArray[i];
                if(i< anArray.length-1){
                    result+=",";
                }
            }
            result+="],value="+value;
            return result;
        }
        public Object clone() throws CloneNotSupportedException {
            Array copyArray = (Array) super.clone();

            return copyArray;
        }
    }


