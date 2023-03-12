\echo '������� ��� �������'
SELECT *
  FROM jaegers;

\echo '���������� ������ �� ������������ �������'
SELECT *
  FROM jaegers 
 WHERE status != 'Destroyed';

\echo '���������� ������� �����: Mark-1 � Mark-4'
SELECT *
  FROM jaegers
 WHERE mark IN ('1', '4');

\echo '���������� ������� ����� �����: Mark-1 � Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('1', '4');

\echo '��������� ������� �� �������� �� ������� mark'
SELECT *
  FROM jaegers
ORDER BY mark DESC;

\echo '���������� ���������� � ����� ������ ������'
SELECT *
  FROM jaegers
  ORDER BY launch DESC
  LIMIT 1;

\echo '���������� �������, ������� ���������� ������ ���� kaiju'
SELECT modelname
  FROM jaegers
 WHERE kaijukill = 
       (SELECT MAX(kaijukill) FROM jaegers);

\echo '���������� ������� ��� �������'
SELECT AVG(weight) AS jaegersAvg FROM jaegers;

\echo '����������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������'
UPDATE jaegers 
   SET kaijukill = kaijukill + 1
 WHERE status != 'Destroyed';

\echo '������� ������������ �������'
DELETE
  FROM jaegers
 WHERE status = 'Destroyed';

