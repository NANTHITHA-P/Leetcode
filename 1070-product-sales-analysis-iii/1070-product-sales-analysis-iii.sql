select Sales.product_id,Sales.year as first_year,Sales.quantity,Sales.price from Sales 
inner join (select product_id,min(year) as first_year from Sales group by product_id) as f
on Sales.product_id = f.product_id and Sales.year = f.first_year ;
