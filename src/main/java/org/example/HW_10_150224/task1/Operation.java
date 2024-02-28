package org.example.HW_10_150224.task1;

    public enum Operation {
        CONSULTATION("Консультация",1),
        RECEIVING_FUNDS("Получение денежных средств",2),
        INVESTMENT("Вложение средств",3),
        OPENING_DEPOSIT("Открытие депозита",4),
        UTILITY_PAYMENT("Коммунальные платежи",5);

        private int id;
        private final String rusName;

        Operation(String rusName, int id) {
            this.rusName = rusName;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getRusName() {
            return rusName;
        }
    }

