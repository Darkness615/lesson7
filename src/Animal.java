

import java.lang.reflect.Constructor;

    public abstract class Animal {
        private static int count;
        private int MaxRundistance;
        private int MaxSwimdistance;

        public Animal(int MaxRundistance, int MaxSwimdistance) {
            this.MaxRundistance = MaxRundistance;
            this.MaxSwimdistance = MaxSwimdistance;
            count++;
        }

        public int getCount() {
            return count;
        }

        public int getMaxRundistance() {
            return MaxRundistance;
        }

        public int getMaxSwimdistance() {
            return MaxSwimdistance;
        }

        public abstract void swim(int distance);

        public abstract void run(int distance);
    }


