# Starter E-commerce — Partial Version

This is a deliberately incomplete, beginner-level Spring Boot, MySQL, JWT and vanilla JavaScript e-commerce project. It is kept separate from the complete Aylin project.

## Implemented

- Home, Our Story and Contact pages
- Buyer and seller registration
- BCrypt passwords and JWT login
- Authenticated profile
- Public product list and product details
- Seller-owned product creation, image upload, editing, deletion and product list
- Contact-message persistence

## Not implemented yet

- Product search, category/rating/price filters and sorting
- Add to cart and database cart operations
- Checkout and order history
- Seller sales
- Some storefront visual sections and polish

## Run

Requirements: Java 21+, MySQL 8.

```powershell
$env:DB_URL="jdbc:mysql://localhost:3306/starter_store_75?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"
$env:DB_USERNAME="root"
$env:DB_PASSWORD="your-mysql-password"
$env:JWT_SECRET="replace-with-a-long-random-secret-at-least-32-bytes"
.\mvnw.cmd spring-boot:run
```

Open <http://localhost:8080>.

No database password or production JWT secret is committed. Uploaded images are stored under `uploads/images` and should not be committed.
