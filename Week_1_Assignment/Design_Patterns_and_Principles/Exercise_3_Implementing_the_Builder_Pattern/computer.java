public class computer {
    private final String processor;
    private final int ram;
    private final int storage;
    private final String gpu;
    private final String os;

    private computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.os = builder.os;
    }

    public static class Builder {
        private final String processor;
        private final int ram;
        private int storage;
        private String gpu = "None"; 
        private String os = "None";  

        public Builder(String processor, int ram, int storage) {
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public computer build() {
            return new computer(this);
        }

       
        public String getProcessor() { 
            return processor; 
        }
        public int getRam() { 
            return ram; 
        }
        public int getStorage() { 
            return storage; 
        }
        public String getGpu() { 
            return gpu; 
        }
        public String getOs() { 
            return os; 
        }
    }

    
    public String getProcessor() { 
        return processor; 
    }
    public int getRam() { 
        return ram; 
    }
    public int getStorage() { 
        return storage; 
    }
    public String getGpu() { 
        return gpu; 
    }
    public String getOs() { 
        return os; 
    }
}
