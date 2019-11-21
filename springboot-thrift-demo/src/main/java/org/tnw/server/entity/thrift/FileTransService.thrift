namespace java org.tnw.server.entity.thrift
struct FileTransInfo{
    1: string targetIp;
    2: string filePath;
}

struct Code{
 1: i32 statusCode;
 2: i32 errCode;
}

service FileTransService{
    i32 createTask(1: FileTransInfo info),
    Code getStatus(),
    i32 reset();
}