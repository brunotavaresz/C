if [ -z "$1" ]; then
    echo "Usage: $0 <filename.agl>"
    exit 1
fi
cd ../src/grammar
antlr4-build
echo "Running $1"
java AGLMain ../../examples/$1
cd ../../Results
input_file="$1"
output_file="${input_file%.agl}.py"
python3 "$output_file"
