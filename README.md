## Store app(Saleforces 2022 Interview project)
### Assigment:
In a store you can buy different products - food, beverages, clothes, appliances.

Each product has a name, brand and price. 

The perishable products (food and beverages) have expiration dates as well. 

For the clothes a size (standard from XS, S, M, L, XL) and color is stored, and for appliances - model, production date and weight (in kg).

If perishable products are about to expire a discount is added - 30% if the expiration date is within 5 days of the purchase date and 70% if the product expires at the date of purchase.

There is a 10% discount on all clothes bought from Tuesday to Saturday, and 7% discount on all appliances that cost above $999 and are purchased during the weekend.

Create a class Cashier that has a method to print a receipt. The method accepts a cart (collection of products) and the date and time of purchase. It should print all purchased products with their price, quantity, the total sum and the total discount in the format:

Date: date and time of purchase
---Products---


name brand
quantityx price per product = total price without discount
discount :  discount  %  discount sum(if applicable)

-----------------------------------------------------------------------------------

SUBTOTAL: total sum for all products
DISCOUNT: - sum of all discounts

TOTAL: sum to pay

## Example(Test input)
### Data:
#### Food: 

Name: apples, 

Brand: BrandA,

Price: $1.50, 

Expiration date: 2021-06-14

#### Beverage: 

Name: milk, 

Brand: BrandM, 

Price: $0.99, 

Expiration date: 2022-02-02

#### Clothes: 

Name: T-shirt,

Brand: BrandT, 

Price: $15.99,

Size: M

Color: violet

#### Appliance:

Name: laptop

Brand: BrandL

Price: $2345

Model: ModelL

Production date: 2021-03-03

Weight: 1.125 kg

### Cart:
Apples x 2.45 kg

Milk x 3 bottles

T-shirts x 2

Laptop x 1

#### Date and time of purchase:
2021-06-14 12:34:56


## Expected output
Date: 2021-06-14 12:34:56

---Products---


apples BrandA

2,45 x $1,50 = $3,68

discount 70% -$2,57



milk BrandM

3 x $0,99 = $2,97



T-shirt BrandT M violet

2 x $15,99 = $31,98



laptop BrandL ModelL

1 x $2345 = $2345

-----------------------------------------------------------------------------------

SUBTOTAL: $2383,63

DISCOUNT: -$2,57



TOTAL: $2381,05
