# Write your MySQL query statement below
(select u.name  as results
from Users u inner join MovieRating mr on u.user_id = mr.user_id
group by u.user_id
order by count(*) desc ,u.name limit 1)
union all 
(select m.title  as results
from Movies m inner join MovieRating mr on m.movie_id = mr.movie_id
where mr.created_at >='2020-02-01' and mr.created_at<='2020-02-29'
group by m.movie_id
order by  avg(mr.rating) desc ,m.title limit 1);
