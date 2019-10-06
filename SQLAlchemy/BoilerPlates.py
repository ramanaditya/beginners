import os

# other imports for web appication in Django or Flask

from sqlalchemy import create_engine
from sqlalchemy.orm import scoped_session, sessionmaker

engine = create_engine(os.getenv("DATABASE URL")) # DATABASE URL is environment variable set before running Web application
db = scoped_session(sessionmaker(bind=engine))

# SQL Queries and functions in Application