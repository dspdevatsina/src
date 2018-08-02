import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;  
import java.math.BigInteger;    
import java.security.MessageDigest;   
import java.io.FileNotFoundException;    

public class TestCard {
	public static void main(String[] args) throws InterruptedException,
		IOException {

			File source = new File("I:\\download\\OK.rar");
			File dest = new File("I:\\download\\OK_test.rar");
			String sour_md5 = md5HashCode(source.toString());
			String dest_md5 ="";
			for(int i=0;i<100;i++)
			{
				System.out.println("Number "+i+" to test:");
				copyFileUsingFileChannels(source, dest);
				dest_md5 = md5HashCode(dest.toString());
				if(sour_md5.equals(dest_md5))
					System.out.println("equal");
				else
				{
					System.out.println("not equal");
					System.out.println("problem md5 ="dest_md5);
					System.out.println("orient md5 = "sour_md5);
					break;
				}
					
			}
	}

			
	
	private static void copyFileUsingFileChannels(File source, File dest) throws IOException {    
		    FileChannel inputChannel = null;
		    FileChannel outputChannel = null;
		    try {
		        inputChannel = new FileInputStream(source).getChannel();
		        outputChannel = new FileOutputStream(dest).getChannel();
		        outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		    } finally {
		        inputChannel.close();
		        outputChannel.close();
		    }
		}
	
    public static String md5HashCode(String filePath) throws FileNotFoundException{    
        FileInputStream fis = new FileInputStream(filePath);    
        return md5HashCode(fis);    
    }    	
    
    public static String md5HashCode(InputStream fis) {    
        try {    
            //拿到一个MD5转换器,如果想使用SHA-1或SHA-256，则传入SHA-1,SHA-256    
            MessageDigest md = MessageDigest.getInstance("MD5");
              
            //分多次将一个文件读入，对于大型文件而言，比较推荐这种方式，占用内存比较少。  
            byte[] buffer = new byte[1024];    
            int length = -1;    
            while ((length = fis.read(buffer, 0, 1024)) != -1) {    
                md.update(buffer, 0, length);    
            }    
            fis.close();  
            //转换并返回包含16个元素字节数组,返回数值范围为-128到127  
            byte[] md5Bytes  = md.digest();  
            BigInteger bigInt = new BigInteger(1, md5Bytes);//1代表绝对值   
            return bigInt.toString(16);//转换为16进制  
        } catch (Exception e) {
            e.printStackTrace();    
            return "";    
        }    
    } 
}


	