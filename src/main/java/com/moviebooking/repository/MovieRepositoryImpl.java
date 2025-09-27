package com.moviebooking.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		movie1.setEnglishTitle("Chainsaw Man The Movie: Reze Arc");
		movie1.setDescription("데블 헌터로 일하는 소년 ‘덴지’는 조직의 배신으로 죽음에 내몰린 순간 전기톱 악마견 ‘포치타’와의 계약으로 하나로 합쳐져 누구도 막을 수 없는 존재 ‘체인소 맨’으로 다시 태어난다. 악마와 사냥꾼, 그리고 정체불명의 적들이 얽힌 잔혹한 전쟁 속에서 ‘레제’라는 이름의 미스터리한 소녀가 ‘덴지’ 앞에 나타나는데… ‘덴지’는 사랑이라는 감정에 이끌려 지금껏 가장 위험한 배틀에 몸을 던진다!");
		
		
		Movie movie2 = new Movie();	
		movie2.setId(2L);
		movie2.setGenre("스릴러");
		movie2.setTitle("어쩔수가없다");
		movie2.setRunningTime(139);
		movie2.setReleaseDate("2025.09.24");
		movie2.setStar((float) 8.55);
		movie2.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250905_42%2F1757058293061HRnRa_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie2.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=242311&mid=59793");
		movie2.setEnglishTitle("NO OTHER CHOICE");
		movie2.setDescription("‘다 이루었다’는 생각이 들 만큼 삶에 만족하던 25년 경력의 제지 전문가 ‘만수’(이병헌). 아내 ‘미리’(손예진), 두 아이, 반려견들과 함께 행복한 일상을 보내던 만수는 회사로부터 돌연 해고 통보를 받는다. 미안합니다. 어쩔 수가 없습니다. 목이 잘려 나가는 듯한 충격에 괴로워하던 만수는, 가족을 위해 석 달 안에 반드시 재취업하겠다고 다짐한다. 그 다짐이 무색하게도, 그는 1년 넘게 마트에서 일하며 면접장을 전전하고, 급기야 어렵게 장만한 집마저 빼앗길 위기에 처한다. 무작정 [문 제지]를 찾아가 필사적으로 이력서를 내밀지만, ‘선출’(박희순) 반장 앞에서 굴욕만 당한다. [문 제지]의 자리는 누구보다 자신이 제격이라고 확신한 만수는 모종의 결심을 한다. 나를 위한 자리가 없다면, 내가 만들어서라도 취업에 성공하겠다.");
		
		Movie movie3 = new Movie();	
		movie3.setId(3L);
		movie3.setGenre("미스터리");
		movie3.setTitle("얼굴");
		movie3.setRunningTime(103);
		movie3.setReleaseDate("2025.09.11");
		movie3.setStar((float) 8.18);
		movie3.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250819_216%2F17555951470607VuW5_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie3.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=242222&mid=59742");
		movie3.setEnglishTitle("The Ugly");
		movie3.setDescription("이 분이 저희 어머니라고요? 태어나서 아무것도 볼 수 없었던 시각장애인임에도 불구하고 세상에서 가장 아름다운 도장을 만드는 장인으로 거듭난 ‘임영규’와 그의 아들 ‘임동환’에게 경찰에게서 한 통의 전화가 걸려온다. 40년 전 실종된 아내이자 어머니 ‘정영희’의 백골 사체가 발견되었다는 것. 얼굴조차 몰랐던 어머니가 살해됐을 가능성도 있다는 이야기를 듣게 된 ‘임동환’은 아버지 ‘임영규’의 다큐멘터리를 촬영하던 PD ‘김수진’과 함께 어머니의 죽음을 추적하게 된다. 그리고 그 과정에서 만난, 40년 전 어머니와 함께 청계천 의류 공장에서 일했던 이들의 기억을 통해 가려진 진실을 마주하게 되는데……");
		
		Movie movie4 = new Movie();	
		movie4.setId(4L);
		movie4.setGenre("애니메이션");
		movie4.setTitle("극장판 귀멸의 칼날: 무한성편");
		movie4.setRunningTime(155);
		movie4.setReleaseDate("2025.08.22");
		movie4.setStar((float) 9.07);
		movie4.setPosterUrl("https://search.pstatic.net/common?type=o&size=304x456&quality=100&direct=true&src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20250822_188%2F1755830748444J7mqt_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		movie4.setLinkUrl("https://movie.naver.com/movie/bi/mi/mediaView.nhn?code=245510&mid=59508");
		movie4.setEnglishTitle("Demon Slayer: Kimetsu No Yaiba Infinity Castle Arc");
		movie4.setDescription("혈귀로 변해버린 여동생 네즈코를 인간으로 되돌리기 위해 혈귀를 사냥하는 조직인 《귀살대》에 입대한 카마도 탄지로. 입대 후 동료인 아가츠마 젠이츠, 하시비라 이노스케와 함께 많은 혈귀와 싸우고, 성장하면서 세 사람의 우정과 유대는 깊어진다. 탄지로는 《귀살대》 최고위 검사인 《주》와도 함께 싸웠다. 「무한열차」에서는 염주?렌고쿠 쿄쥬로, 「유곽」에서는 음주?우즈이 텐겐, 「도공 마을」에서는 하주?토키토 무이치로, 연주?칸로지 미츠리와 함께 혈귀를 상대로 격렬한 전투를 벌였다. 그 후 다가올 혈귀와의 결전에 대비해 귀살대원들과 함께 《주》가 주도하는 합동 강화 훈련에 참가해 훈련을 받던 도중 《귀살대》의 본부인 우부야시키 저택에 나타난 키부츠지 무잔. 어르신의 위기에 달려온 《주》들과 탄지로였지만, 무잔의 술수로 의문의 공간으로 떨어지고 말았는데. 탄지로 일행이 떨어진 곳, 그곳은 혈귀의 본거지 《무한성》─ “귀살대”와 “혈귀”의 최종 결전의 포문이 열린다.");
		
		listOfMovies.add(movie1);
		listOfMovies.add(movie2);
		listOfMovies.add(movie3);
		listOfMovies.add(movie4);
	}
	public List<Movie> getAllMovieList() {
		return listOfMovies;
	}
	
	public Optional<Movie> findById(Long id) {
		return listOfMovies.stream().filter(movie -> movie.getId().equals(id)).findFirst();
	}

}
