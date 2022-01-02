/* typedef struct { */
/*    const void *ptr_data[2]; */
/*    unsigned int_data; */
/*  } CXType; */
 
/* typedef enum CXIdxDeclInfoFlags { CXIdxDeclFlag_Skipped = 0x1 } CXIdxDeclInfoFlags; */
/* enum CXTLSKind { CXTLS_None = 0, CXTLS_Dynamic, CXTLS_Static }; */

/* typedef struct CXUnsavedFile { */
   
/*   const char *Filename; */
   
/*   const char *Contents; */
  
/*   unsigned long Length; */

/*   signed char hello; */
/* } CXUnsavedFile; */


/* enum { */
/*    X = 1, */
/*    Y = 2 */
/* }; */

/* typedef enum CXTypeKind { */
/*    bla = 1 */
/* } CXTypeKind; */

/* typedef struct { */
/*   enum CXTypeKind kind; */
/*   void *data[2]; */
/*   unsigned test; */
/* } CXCursor; */

/* typedef int Hello; */

/* struct point { */
/*     int x; */
/*     int y; */
/* }; */

/* typedef struct point point; */

/* union myUn{ */
/*     int i; */
/*     long double t; */
/*     struct point p; */
/* } ; */

/* typedef struct bigStruct { */
/*     long one; */
/*     char two; */
/*     int three; */
/*     float four; */
/*     double five; */
/*     struct point six; */
/*     struct point *seven; */
/*     int eight; */
/*     int nine; */
/*     int ten; */
/*     int eleven; */
/*     int twelve; */
/*     int thirteen; */
/*     int fourteen; */
/*     int fifteen; */
/*     int sixteen; */
/*     int seventeen; */
/*     int eighteen; */
/*     int nineteen; */
/*     int twenty; */
/*     int twentyOne; */
/*     int twentyTwo; */
/*     int twentyThree; */
/*     union myUn twentyFive; */
/*     int twentySix; */
/* } bigStruct; */

  
 /**
  * Retrieve the type of a CXCursor (if any).
  */
 /* CXType clang_getCursorType(size_t hel, CXCursor C, CXType *types[3], long double *idx); */
 /* CXTypeKind clang_getCursorKing(size_t hel, CXCursor C, CXType *types[3], long double *idx); */

 /* CXTypeKind clang_getCursorKing(size_t hel, CXType *types[3], long double *idx); */
// Boolean type
#if defined(__STDC__) && __STDC_VERSION__ >= 199901L
    #include <stdbool.h>
    /* #define bool _Bool */
#elif !defined(__cplusplus) && !defined(bool)
    typedef enum bool { false, true } bool;
    #define RL_BOOL_TYPE
#endif

// check if hello
bool IsKeyPressed(int key);                             // Check if a key has been pressed once
bool IsKeyDown(int key);                                // Check if a key is being pressed
bool IsKeyReleased(int key);                            // Check if a key has been released once
bool IsKeyUp(int key);                                  // Check if a key is NOT being pressed
void SetExitKey(int key);                               // Set a custom key to exit program (default is ESC)
