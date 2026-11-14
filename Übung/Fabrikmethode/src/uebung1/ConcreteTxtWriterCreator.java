package uebung1;

public class ConcreteTxtWriterCreator extends WriterCreator{
	@Override
	public WriterProduct factoryMethod(){
		return new ConcreteTxtWriterProduct(); //gibt ein Objekt zurück
	}
}