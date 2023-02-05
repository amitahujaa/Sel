package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

class ScriptPython {
    Process mProcess;

    public void runScript(List<Apartments> list) throws IOException {
        Process process;
        try{
            process = Runtime.getRuntime().exec("python3 /home/gd/workspace/daftlistings/a.py");
            mProcess = process;
        }catch(Exception e) {
            System.out.println("Exception Raised" + e.toString());
        }
        InputStream stdout = mProcess.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
        try{
            String line = reader.readLine();
            System.out.println(line);
            line = reader.readLine();
            System.out.println(line);
            while(line != null){
                Apartments apartments = new Apartments();
                line = reader.readLine();
                apartments.setName(line);
                line = reader.readLine();
                apartments.setPrice(line);
                line = reader.readLine();
                apartments.setLink(line);
                list.add(apartments);
            }
        }catch(IOException e){
            System.out.println("Exception in reading output"+ e.toString());
        }
    }
}

