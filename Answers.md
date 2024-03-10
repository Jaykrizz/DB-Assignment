1.
The "Product" table consists of entities like
id, name, desc, SKU, category_id, inventory_id, price, discount_id, created_at, modified_at, deleted_at

The "Product_category" table consists of entities like
id, name, desc, created_at, modified_at, deleted_at

category_id in "Product" table is the id entity in "Product_category" table.

Any product in the "Product" table will have a category, this category will have a unique id in the "Product_category" table.

This helps in matching the product with its corresponding category.

Example:

product
id - 888
name - alice in wonderland
desc - alice in wonderland book written          by Lewis Carroll
category_id - 2088

product_category
id - 2088
name - fantasy book
desc - book with stories in fantasy genre

here, the id in "Product_category" is category_id in "Product" table.

2.
By using Foreign Key constraints, in the SQL code,

ALTER TABLE Product ADD CONSTRAINT fk_category_id FOREIGN KEY (category_id) REFERENCES Product_category(id);

By adding this foreign key constraint, the database will prevent the insertion of any records into the "Product" table with a "category_id" that does not exist in the "Product_category" table.
