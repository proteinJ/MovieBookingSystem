package com.moviebooking.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviebooking.domain.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {
	
	private List<Movie> listOfMovies = new ArrayList<Movie>();
	public MovieRepositoryImpl() {
		Movie movie1 = new Movie();	
		movie1.setId(1L);
		movie1.setGenre("애니메이션");
		movie1.setTitle("극장판 체인소 맨: 레저편");
		movie1.setRunningTime(100);
		movie1.setReleaseDate("2025.09.24");
		movie1.setStar((float) 9.61);
		movie1.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250910_176%2F1757469536405jCI3h_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie1.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=250128&mid=59977");
		
		Movie movie2 = new Movie();	
		movie2.setId(2L);
		movie2.setGenre("스릴러");
		movie2.setTitle("어쩔수가없다");
		movie2.setRunningTime(139);
		movie2.setReleaseDate("2025.09.24");
		movie2.setStar((float) 8.55);
		movie2.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250905_42%2F1757058293061HRnRa_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie2.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=242311&mid=59793");
		
		Movie movie3 = new Movie();	
		movie3.setId(3L);
		movie3.setGenre("미스터리");
		movie3.setTitle("얼굴");
		movie3.setRunningTime(103);
		movie3.setReleaseDate("2025.09.11");
		movie3.setStar((float) 8.18);
		movie3.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250819_216%2F17555951470607VuW5_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie3.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=242222&mid=59742");
		
		Movie movie4 = new Movie();	
		movie4.setId(4L);
		movie4.setGenre("애니메이션");
		movie4.setTitle("극장판 귀멸의 칼날: 무한성편");
		movie4.setRunningTime(155);
		movie4.setReleaseDate("2025.08.22");
		movie4.setStar((float) 9.07);
		movie4.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250822_188%2F1755830748444J7mqt_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie4.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=245510&mid=59508");
		
		listOfMovies.add(movie1);
		listOfMovies.add(movie2);
		listOfMovies.add(movie3);
		listOfMovies.add(movie4);
	}
	public List<Movie> getAllMovieList() {
		return listOfMovies;
	}

}
