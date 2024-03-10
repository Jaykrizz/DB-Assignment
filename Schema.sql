-- Create Product table
CREATE TABLE Product (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(255),
    description CLOB,
    SKU VARCHAR2(50),
    category_id NUMBER,
    inventory_id NUMBER,
    price NUMBER(10, 2),
    discount_id NUMBER,
    created_at TIMESTAMP,
    modified_at TIMESTAMP,
    deleted_at TIMESTAMP
);

-- Create Product_category table
CREATE TABLE Product_category (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(255),
    description CLOB,
    created_at TIMESTAMP,
    modified_at TIMESTAMP,
    deleted_at TIMESTAMP
);

-- Create Product_inventory table
CREATE TABLE Product_inventory (
    id NUMBER PRIMARY KEY,
    quantity NUMBER,
    created_at TIMESTAMP,
    modified_at TIMESTAMP,
    deleted_at TIMESTAMP
);

-- Create Discount table
CREATE TABLE Discount (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(255),
    description CLOB,
    discount_percent NUMBER(5, 2),
    active CHAR(1),
    created_at TIMESTAMP,
    modified_at TIMESTAMP,
    deleted_at TIMESTAMP
);
