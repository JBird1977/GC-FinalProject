package co.finalfour.beerme.entity;

import java.util.List;

public class BreweryResponse{
   	private Number currentPage;
   	private List<Brewery> data;
   	private Number numberOfPages;
   	private String status;
   	private Number totalResults;

 	public Number getCurrentPage(){
		return this.currentPage;
	}
	public void setCurrentPage(Number currentPage){
		this.currentPage = currentPage;
	}
 	public List<Brewery> getData(){
		return this.data;
	}
	public void setData(List<Brewery> data){
		this.data = data;
	}
 	public Number getNumberOfPages(){
		return this.numberOfPages;
	}
	public void setNumberOfPages(Number numberOfPages){
		this.numberOfPages = numberOfPages;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
 	public Number getTotalResults(){
		return this.totalResults;
	}
	public void setTotalResults(Number totalResults){
		this.totalResults = totalResults;
	}
	
	@Override
	public String toString() {
		return "BreweryResponse [currentPage=" + currentPage + ", data=" + data + ", numberOfPages=" + numberOfPages
				+ ", status=" + status + ", totalResults=" + totalResults + "]";
	}
	
}
