import os
import csv # to read a .csv file

from sqlalchemy import create_engine
from sqlalchemy.orm import scoped_session, sessionmaker


engine = create_engine(os.getenv("DATABASE URL")) 
db = scoped_session(sessionmaker(bind=engine))

def main():
    f = open("filename.csv") #opening a CSV file
    reader = csv.reader(f)

    for col1, col2, col3 in reader:
        db.execute("INSERT INTO table_name (col1_name, col2_name, col3_name) VALUES (:colA, :colB, :colC)",\
        {"colA": col1, "colB": col2, "colC": col3})
    db.commit() # to save changes


if __name__ == "__main__":
    main()