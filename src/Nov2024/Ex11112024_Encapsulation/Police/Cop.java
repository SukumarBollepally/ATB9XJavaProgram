package Nov2024.Ex11112024_Encapsulation.Police;

public class Cop {

        private int gun;
        public String iCard;

        public Cop(int gun){
            this.gun = gun;
        }

        protected void canIShoot(){
            System.out.println("Yes, You can!!");
        }

    }
