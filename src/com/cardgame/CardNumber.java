package com.cardgame;

public enum CardNumber {
    ONE {
        @Override
        public String toString() {
            return "A";
        }
    }, TWO{
        @Override
        public String toString() {
            return "2";
        }
    }, THREE{
        @Override
        public String toString() {
            return "3";
        }
    }, FOUR{
        @Override
        public String toString() {
            return "4";
        }
    }, FIVE{
        @Override
        public String toString() {
            return "5";
        }
    }, SIX{
        @Override
        public String toString() {
            return "6";
        }
    }, SEVEN{
        @Override
        public String toString() {
            return "7";
        }
    }, EIGHT{
        @Override
        public String toString() {
            return "8";
        }
    }, NIGHT{
        @Override
        public String toString() {
            return "9";
        }
    }, TEN{
        @Override
        public String toString() {
            return "10";
        }
    }, ELEVEN{
        @Override
        public String toString() {
            return "J";
        }
    }, TWELVE{
        @Override
        public String toString() {
            return "Q";
        }
    }, THIRTEEN{
        @Override
        public String toString() {
            return "K";
        }
    };


}
