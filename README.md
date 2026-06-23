# Spring Core Questions

1.Create an interface called Quotes with a method getQuotes() , implement this interface by two classes one returns 3 quotes about friendship another class about hardwork with 4 quotes. 
a) Inject quotes into PrintQuotes, DisplayQuotes.
b) Implement @primary, @qualifier, @lazy, @Scope, @postconstruct, @predestroy.
c) Create different versions of PrintQuotes for constructor injection, property injection and field injection.

2. Create an aspect called security aspect where before advice is applied to payment method of payment component, after advice is to be applied to validateCC method, around advice is to be applied to process method. find out how to return the values returned by the method in around advice.

3. Get average price of products through JDBC spring.
4. Display catcode & avgprice.
5. Insert a new category.

6. Create a method where the name of the product has lessthan 10 letters and price is greater than the given value 
 a)display pro_name and cat_desc.

7. Create repo for sales and retreive 
  a) all sales for given product.
  b) all sales where quantity is between the range.
  c) display sales where the price per unit sold is lesthan the current price of the product.
  d) display sales in the ascending order of quantity.
  e)display 2nd page size '4'.
