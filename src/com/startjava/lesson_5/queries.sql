\echo 'Выводим всю таблицу'
SELECT *
  FROM jaegers;

\echo 'Отображаем только не уничтоженных роботов'
SELECT *
  FROM jaegers 
 WHERE status != 'Destroyed';

\echo 'Отображаем роботов серий: Mark-1 и Mark-4'
SELECT *
  FROM jaegers
 WHERE mark IN ('1', '4');

\echo 'Отображаем роботов кроме серий: Mark-1 и Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('1', '4');

\echo 'Сортируем таблицу по убыванию по столбцу mark'
SELECT *
  FROM jaegers
ORDER BY mark DESC;

\echo 'Отображаем информацию о самом старом роботе'
SELECT *
  FROM jaegers
  ORDER BY launch DESC
  LIMIT 1;

\echo 'Отображаем роботов, которые уничтожили больше всех kaiju'
SELECT modelname
  FROM jaegers
 WHERE kaijukill = 
       (SELECT MAX(kaijukill) FROM jaegers);

\echo 'Отображаем средний вес роботов'
SELECT AVG(weight) AS jaegersAvg FROM jaegers;

\echo 'Увеличиваем на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE jaegers 
   SET kaijukill = kaijukill + 1
 WHERE status != 'Destroyed';

\echo 'Удаляем уничтоженных роботов'
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';

