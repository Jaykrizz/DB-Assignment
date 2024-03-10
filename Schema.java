import java.sql.Timestamp;

public class Schema {
    
    public static class Product {
        private int id;
        private String name;
        private String desc;
        private String SKU;
        private int category_id;
        private int inventory_id;
        private double price;
        private int discount_id;
        private Timestamp created_at;
        private Timestamp modified_at;
        private Timestamp deleted_at;

        // Constructor
        public Product(int id, String name, String desc, String SKU, int category_id, int inventory_id, double price, int discount_id, Timestamp created_at, Timestamp modified_at, Timestamp deleted_at) {
            this.id = id;
            this.name = name;
            this.desc = desc;
            this.SKU = SKU;
            this.category_id = category_id;
            this.inventory_id = inventory_id;
            this.price = price;
            this.discount_id = discount_id;
            this.created_at = created_at;
            this.modified_at = modified_at;
            this.deleted_at = deleted_at;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getSKU() {
            return SKU;
        }

        public void setSKU(String SKU) {
            this.SKU = SKU;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public int getInventory_id() {
            return inventory_id;
        }

        public void setInventory_id(int inventory_id) {
            this.inventory_id = inventory_id;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getDiscount_id() {
            return discount_id;
        }

        public void setDiscount_id(int discount_id) {
            this.discount_id = discount_id;
        }

        public Timestamp getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Timestamp created_at) {
            this.created_at = created_at;
        }

        public Timestamp getModified_at() {
            return modified_at;
        }

        public void setModified_at(Timestamp modified_at) {
            this.modified_at = modified_at;
        }

        public Timestamp getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Timestamp deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public static class ProductCategory {
        private int id;
        private String name;
        private String desc;
        private Timestamp created_at;
        private Timestamp modified_at;
        private Timestamp deleted_at;

        // Constructor
        public ProductCategory(int id, String name, String desc, Timestamp created_at, Timestamp modified_at, Timestamp deleted_at) {
            this.id = id;
            this.name = name;
            this.desc = desc;
            this.created_at = created_at;
            this.modified_at = modified_at;
            this.deleted_at = deleted_at;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Timestamp getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Timestamp created_at) {
            this.created_at = created_at;
        }

        public Timestamp getModified_at() {
            return modified_at;
        }

        public void setModified_at(Timestamp modified_at) {
            this.modified_at = modified_at;
        }

        public Timestamp getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Timestamp deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public static class ProductInventory {
        private int id;
        private int quantity;
        private Timestamp created_at;
        private Timestamp modified_at;
        private Timestamp deleted_at;

        // Constructor
        public ProductInventory(int id, int quantity, Timestamp created_at, Timestamp modified_at, Timestamp deleted_at) {
            this.id = id;
            this.quantity = quantity;
            this.created_at = created_at;
            this.modified_at = modified_at;
            this.deleted_at = deleted_at;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Timestamp getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Timestamp created_at) {
            this.created_at = created_at;
        }

        public Timestamp getModified_at() {
            return modified_at;
        }

        public void setModified_at(Timestamp modified_at) {
            this.modified_at = modified_at;
        }

        public Timestamp getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Timestamp deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public static class Discount {
        private int id;
        private String name;
        private String desc;
        private double discount_percent;
        private boolean active;
        private Timestamp created_at;
        private Timestamp modified_at;
        private Timestamp deleted_at;

        // Constructor
        public Discount(int id, String name, String desc, double discount_percent, boolean active, Timestamp created_at, Timestamp modified_at, Timestamp deleted_at) {
            this.id = id;
            this.name = name;
            this.desc = desc;
            this.discount_percent = discount_percent;
            this.active = active;
            this.created_at = created_at;
            this.modified_at = modified_at;
            this.deleted_at = deleted_at;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public double getDiscount_percent() {
            return discount_percent;
        }

        public void setDiscount_percent(double discount_percent) {
            this.discount_percent = discount_percent;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public Timestamp getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Timestamp created_at) {
            this.created_at = created_at;
        }

        public Timestamp getModified_at() {
            return modified_at;
        }

        public void setModified_at(Timestamp modified_at) {
            this.modified_at = modified_at;
        }

        public Timestamp getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Timestamp deleted_at) {
            this.deleted_at = deleted_at;
        }
    }
}
