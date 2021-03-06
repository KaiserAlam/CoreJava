package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Details {

	public static void main(String[] args) {
		
		HashMap<Integer, Person> map = new HashMap<>();
		
		map.put(001, new Person("Alam"));
		map.put(002, new Person("John", 32));
		map.put(003, new Person("Smith", 38));
		map.put(004, new Person("Simpson", 17));
		map.put(005, new Person("Home"));
		
		Set<?> s = map.entrySet();
		Iterator<?> itr = s.iterator();
		
		try {
			while(itr.hasNext()) { 	
				Map.Entry<?, ?> m = (Map.Entry<?, ?>) itr.next();
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}catch(NoSuchElementException e) {
			System.out.println("no more items in collection");
		}
	}
}


class Person{
	
	private String name;
	private int age;
	private int maximumBooks;
	
	public Person(String name) {
		this.name = name;
		this.maximumBooks = 3;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.maximumBooks = 3;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", maximumBooks=" + maximumBooks + "]";
	}	
}

class Book{
	
	private String title;
	private String author;
	private Person person;
	
	public Book(String title) {
		this.title = title;
		this.author = "unknown";
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

class MyLibrary{
	
	private String name;
	ArrayList<Book> books;
	ArrayList<Person> persons;
	
	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		persons = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}
	
	public void addBook(Book b) {
		this.books.add(b);
	}
	
	public void removeBook(Book b) {
		this.books.remove(b);
	}
	
	public void addPerson(Person p) {
		this.persons.add(p);
	}
	
	public void removePerson(Person p) {
		this.persons.remove(p);
	}
	
	public boolean checkOut(Book b, Person p){
		
		int booksOut = this.getBooksForPerson(p).size();
		
		// Logic to check out books
		if((b.getPerson() == null) && booksOut < p.getMaximumBooks()) {
			
			b.setPerson(p);
			return true;
			
		}else {
			return false;
		}

	}

	public boolean checkIn(Book b){
		return false;
	}

	public ArrayList<Book> getBooksForPerson(Person p){
		
		ArrayList<Book> result = new ArrayList<Book>();
		
		// Logic to assign book to a Person
		for(Book aBook:this.getBooks()) {
			if((aBook.getPerson() != null) && (aBook.getPerson().getName().equals(p.getName()))) {
				result.add(aBook);
			}
		}
		return result;
	}
	
	public ArrayList<Book> getAvailableBooks(){
		ArrayList<Book> result = new ArrayList<>();
		for(Book aBook: this.getBooks()) {
			if(aBook.getPerson() == null) {
				result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getUnavailableBooks(){
		ArrayList<Book> result = new ArrayList<>();
		for(Book aBook: this.getBooks()) {
			if(aBook.getPerson() != null) {
				result.add(aBook);
			}
		}
		return result;
	}
}
