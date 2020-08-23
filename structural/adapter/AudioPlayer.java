package adapter;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
			if(audioType.equalsIgnoreCase("mp3")){
				System.out.println("playing mp3 file :"+fileName);
			}
			else if(audioType.equalsIgnoreCase("vlc")){
				mediaAdapter = new MediaAdapter("vlc");
				mediaAdapter.play("vlc", fileName);
			}else if(audioType.equalsIgnoreCase("mp4")){
				mediaAdapter = new MediaAdapter("mp4");
				mediaAdapter.play("mp4", fileName);
			}else{
				System.out.println("wrong audio file");
			}
	}
}
