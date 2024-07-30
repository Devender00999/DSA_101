# to remove space from file name replacing it with _ or given character
import os


def createSampleDirectories():
    os.mkdir('Hello World')
    os.mkdir('Hello World 1')
    os.mkdir('Hello World 1/Nested Hello World')
    os.mkdir('Hello World 1/Nested Hello World/Nested Nest.java')
    os.mkdir('Hello World 2')
    os.mkdir('Hello World 3')


os.chdir('Python/Test_Folder')
print(os.getcwd())


# createSampleDirectories()
def getListOfAllFiles(path):
    listDir = os.listdir(path)
    for dir in listDir:
        fullpath = os.path.join(path, dir)
        if (os.path.isdir(fullpath)):
            getListOfAllFiles(fullpath)
            if " " in dir:
                os.rename(fullpath, os.path.join(path, dir.replace(" ", '_')))
        else:
            if " " in dir:
                os.rename(fullpath,  os.path.join(path, dir.replace(" ", '_')))
    
    # listDir[0]


getListOfAllFiles(os.getcwd())
