# Python equivalents of SQL Queries

1. SELECT * FROM FLIGHTS;
```python
    Flight.query.all()
```
2. SELECT * FROM FLIGHTS WHERE ORIGIN = "PARIS" LIMIT 1;
```python
    Flight.query.filter_by(origin="PARIS").first()
```
3. SELECT COUNT(*) FROM FLIGHTS WHERE ORIGIN = "PARIS";
```python
    Flight.query.filter_by(origin="PARIS").count()
```
4. SELECT * FROM FLIGHTS WHERE ID = 28;
```python
    Flight.query.get(28)
```
5. SELECT * FROM FLIGHTS ORDER BY ORIGIN DESC;
```python
    Flight.query.order_by(Flight.origin.desc()).all()
```
6. SELECT * FROM FLIGHTS WHERE ORIGIN != "PARIS";
```python
    Flight.query.filter(Flight.origin != "PARIS").all()
```   
7. SELECT * FROM FLIGHTS WHERE ORIGIN LIKE %a%;
```python
    Flight.query.filter(Flight.origin.like("%a%")).all()
```
8. SELECT * FROM FLIGHTS WHERE ORIGIN IN ('PARIS', 'TOKYO');
```python
    Flight.query.filter(Flight.origin.in__(["TOKYO","PARIS"])).all()
```
9.  SELECT * FROM FLIGHTS WHERE ORIGIN = "PARIS" AND DURATION > 500;
```python
    Flight.query.filter(and_(Flight.origin=="PARIS",Flight.duration>500)).all()
```    
10. SELECT * FROM FLIGHTS JOIN PASSENGERS ON FLIGHT.ID = PASSENGERS.FLIGHT_ID;
```python
    db.session.query(Flight, Passenger).filter(Flight.id==Passenger.flight_id).all()
``` 
11. UPDATE FLIGHTS SET DURATION = 280 WHERE ID = 6;
```python
    flight_a = Flight.query.get(6)
    flight_a.duration = 280
``` 
12. DELETE FROM FLIGHTS WHERE ID = 28;
```python
    flight_b = Flight.query.get(28)
    db.session.delete(flight_b)
```
 